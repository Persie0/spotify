package p204p;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class g9k extends ContextWrapper {

    /* JADX INFO: renamed from: f */
    public static Configuration f77815f;

    /* JADX INFO: renamed from: a */
    public int f77816a;

    /* JADX INFO: renamed from: b */
    public Resources.Theme f77817b;

    /* JADX INFO: renamed from: c */
    public LayoutInflater f77818c;

    /* JADX INFO: renamed from: d */
    public Configuration f77819d;

    /* JADX INFO: renamed from: e */
    public Resources f77820e;

    public g9k(Context context, int i) {
        super(context);
        this.f77816a = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m44060a(Configuration configuration) {
        if (this.f77820e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f77819d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f77819d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m44061b() {
        if (this.f77817b == null) {
            this.f77817b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f77817b.setTo(theme);
            }
        }
        this.f77817b.applyStyle(this.f77816a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.f77820e == null) {
            Configuration configuration = this.f77819d;
            if (configuration == null) {
                this.f77820e = super.getResources();
            } else {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f77815f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f77815f = configuration2;
                    }
                    if (configuration.equals(f77815f)) {
                        this.f77820e = super.getResources();
                    }
                }
                this.f77820e = f9k.m41067a(this, this.f77819d).getResources();
            }
        }
        return this.f77820e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f77818c == null) {
            this.f77818c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f77818c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f77817b;
        if (theme != null) {
            return theme;
        }
        if (this.f77816a == 0) {
            this.f77816a = R.style.Theme_AppCompat_Light;
        }
        m44061b();
        return this.f77817b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f77816a != i) {
            this.f77816a = i;
            m44061b();
        }
    }
}
