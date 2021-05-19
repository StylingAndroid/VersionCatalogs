// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        val libs = project.extensions.getByType<VersionCatalogsExtension>().named("libs") as org.gradle.accessors.dm.LibrariesForLibs
        classpath(libs.android.gradlePlugin)
        classpath(libs.kotlin.gradlePlugin)

        classpath(libs.versionsPlugin)
        classpath(libs.detektPlugin)
        classpath(libs.ktlintPlugin)
        classpath(libs.canidropjetifierPlugin)
    }
}

subprojects {
    apply(plugin ="com.github.ben-manes.versions")
    apply(plugin ="io.gitlab.arturbosch.detekt")
    apply(plugin ="org.jlleitschuh.gradle.ktlint")
    apply(plugin ="com.github.plnice.canidropjetifier")
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
