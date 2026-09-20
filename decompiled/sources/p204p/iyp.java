package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class iyp {

    /* JADX INFO: renamed from: a */
    public final Context f107036a;

    /* JADX INFO: renamed from: b */
    public final xre f107037b;

    /* JADX INFO: renamed from: c */
    public final als f107038c;

    /* JADX INFO: renamed from: d */
    public final xbp f107039d;

    public iyp(Context context, xre xreVar, als alsVar, xbp xbpVar) {
        this.f107036a = context;
        this.f107037b = xreVar;
        this.f107038c = alsVar;
        this.f107039d = xbpVar;
    }

    /* JADX INFO: renamed from: a */
    public final hyp m51952a(String str, int i, int i2, Integer num, boolean z, boolean z2) {
        return new hyp(this.f107036a.getResources(), this.f107037b, this.f107038c, this.f107039d, new iaw(str, i, i2, num, z), z, z2);
    }
}
