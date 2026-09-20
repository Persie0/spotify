package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class qa41 {

    /* JADX INFO: renamed from: a */
    public final gcu0 f186742a;

    /* JADX INFO: renamed from: b */
    public final o89 f186743b;

    /* JADX INFO: renamed from: c */
    public final Context f186744c;

    /* JADX INFO: renamed from: d */
    public final boolean f186745d;

    /* JADX INFO: renamed from: e */
    public final luk f186746e;

    /* JADX INFO: renamed from: g */
    public l221 f186748g;

    /* JADX INFO: renamed from: h */
    public c9k f186749h;

    /* JADX INFO: renamed from: f */
    public int f186747f = 2;

    /* JADX INFO: renamed from: i */
    public int f186750i = 3;

    /* JADX INFO: renamed from: j */
    public int f186751j = 2;

    /* JADX INFO: renamed from: k */
    public int f186752k = 2;

    public qa41(gcu0 gcu0Var, o89 o89Var, Context context, boolean z, luk lukVar) {
        this.f186742a = gcu0Var;
        this.f186743b = o89Var;
        this.f186744c = context;
        this.f186745d = z;
        this.f186746e = lukVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m72416a() {
        int i = this.f186750i;
        int i2 = 3;
        int i3 = 1;
        if (i == 2 || i == 3) {
            int i4 = i == 2 ? this.f186752k : this.f186751j;
            if (i4 == 1) {
                i2 = 1;
            } else if (i4 != 3) {
                i2 = 4;
                if (i4 != 4) {
                    i2 = 2;
                }
            }
            i3 = i2;
        }
        if (this.f186747f != i3) {
            this.f186747f = i3;
        }
    }
}
