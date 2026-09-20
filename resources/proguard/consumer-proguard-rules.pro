# Used from native
-keep class com.spotify.base.java.logging.Logger {
 public static void core(...);
}

# Log removal
-assumenosideeffects class com.spotify.base.java.logging.Logger {
    public static void d(java.lang.String, ...);
    public static void d(java.lang.Throwable, java.lang.String, ...);
    public static void v(java.lang.String, ...);
}
-assumenosideeffects class android.util.Log {
    public static int d(java.lang.String, java.lang.String);
    public static int d(java.lang.String, java.lang.String, java.lang.Throwable);
    public static int v(java.lang.String, java.lang.String);
    public static int v(java.lang.String, java.lang.String, java.lang.Throwable);
    public static int i(java.lang.String, java.lang.String);
    public static int i(java.lang.String, java.lang.String, java.lang.Throwable);
    public static int w(java.lang.String, java.lang.Throwable);
    public static int w(java.lang.String, java.lang.String, java.lang.Throwable);
    public static int w(java.lang.String, java.lang.String);
    public static int wtf(java.lang.String, java.lang.String);
    public static int wtf(java.lang.String, java.lang.Throwable);
    public static int wtf(java.lang.String, java.lang.String, java.lang.Throwable);
}