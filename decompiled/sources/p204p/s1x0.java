package p204p;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class s1x0 {

    /* JADX INFO: renamed from: a */
    public final ColorStateList f204849a;

    /* JADX INFO: renamed from: b */
    public final Configuration f204850b;

    /* JADX INFO: renamed from: c */
    public final int f204851c;

    public s1x0(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f204849a = colorStateList;
        this.f204850b = configuration;
        this.f204851c = theme == null ? 0 : theme.hashCode();
    }
}
