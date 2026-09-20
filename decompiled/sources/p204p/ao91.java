package p204p;

import com.spotify.searchview.proto.Entity;

/* JADX INFO: loaded from: classes11.dex */
public final class ao91 {

    /* JADX INFO: renamed from: i */
    public static final ao91 f17614i = new ao91(new ao91(null, Entity.SERP_METADATA_FIELD_NUMBER), 2012);

    /* JADX INFO: renamed from: a */
    public final boolean f17615a;

    /* JADX INFO: renamed from: b */
    public final boolean f17616b;

    /* JADX INFO: renamed from: c */
    public final ao91 f17617c;

    /* JADX INFO: renamed from: d */
    public final boolean f17618d;

    /* JADX INFO: renamed from: e */
    public final ao91 f17619e;

    /* JADX INFO: renamed from: f */
    public final ao91 f17620f;

    /* JADX INFO: renamed from: g */
    public final boolean f17621g;

    /* JADX INFO: renamed from: h */
    public final boolean f17622h;

    public ao91(boolean z, boolean z2, ao91 ao91Var, boolean z3, ao91 ao91Var2, ao91 ao91Var3, boolean z4, boolean z5) {
        this.f17615a = z;
        this.f17616b = z2;
        this.f17617c = ao91Var;
        this.f17618d = z3;
        this.f17619e = ao91Var2;
        this.f17620f = ao91Var3;
        this.f17621g = z4;
        this.f17622h = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ao91(ao91 ao91Var, int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        ao91 ao91Var2 = (i & 32) != 0 ? null : ao91Var;
        this(z, z2, ao91Var2, true, ao91Var2, ao91Var2, (i & 512) == 0, (i & 1024) == 0);
    }
}
