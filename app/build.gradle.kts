plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.assignmentandroidapi"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.assignmentandroidapi"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("androidx.navigation:navigation-fragment:2.7.7")
    implementation ("androidx.navigation:navigation-ui:2.7.7")
    implementation ("me.relex:circleindicator:2.1.6")
    implementation ("androidx.cardview:cardview:1.0.0")
// Add libs
    implementation ("androidx.recyclerview:recyclerview:1.3.2")
// Glide
    implementation ("com.github.bumptech.glide:glide:4.15.1")
// Circle ImageView
    implementation ("de.hdodenhof:circleimageview:3.1.0")
// Thêm ViewPager2
    implementation ("androidx.viewpager2:viewpager2:1.0.0")
// Thêm Rounded image view
    implementation ("com.makeramen:roundedimageview:2.3.0")
    implementation ("com.android.volley:volley:1.2.1")
    implementation ("de.hdodenhof:circleimageview:3.1.0")

}