package p204p;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: classes3.dex */
public final class u1f1 implements ave {

    /* JADX INFO: renamed from: a */
    public final Context f225813a;

    public u1f1(Application application) {
        this.f225813a = application;
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: a */
    public final Float mo27239a() {
        try {
            return Float.valueOf(Settings.System.getFloat(this.f225813a.getContentResolver(), "font_scale", 0.0f));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: b */
    public final Float mo27240b() {
        try {
            return Float.valueOf(Settings.Global.getFloat(this.f225813a.getContentResolver(), "transition_animation_scale", 0.0f));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: c */
    public final String mo27241c() {
        try {
            int i = Build.VERSION.SDK_INT;
            Context context = this.f225813a;
            return i >= 31 ? String.valueOf(Settings.System.getInt(context.getContentResolver(), "time_12_24", 12)) : Settings.System.getString(context.getContentResolver(), "date_format");
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: d */
    public final Float mo27242d() {
        try {
            return Float.valueOf(Settings.Global.getFloat(this.f225813a.getContentResolver(), "window_animation_scale", 0.0f));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p204p.ave
    /* JADX INFO: renamed from: f */
    public final Integer mo27243f() {
        try {
            return Integer.valueOf(Settings.System.getInt(this.f225813a.getContentResolver(), "screen_off_timeout"));
        } catch (Exception unused) {
            return null;
        }
    }
}
