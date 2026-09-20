package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class n1d0 extends w400 {

    /* JADX INFO: renamed from: i */
    public static final Object f149395i = new Object();

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f149396f = 1;

    /* JADX INFO: renamed from: g */
    public final Object f149397g;

    /* JADX INFO: renamed from: h */
    public final Object f149398h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1d0(hz31 hz31Var, qp71 qp71Var, qp71 qp71Var2) {
        super(qp71Var);
        this.f149398h = hz31Var;
        this.f149397g = qp71Var2;
    }

    @Override // p204p.w400, p204p.qp71
    /* JADX INFO: renamed from: b */
    public int mo26650b(Object obj) {
        Object obj2;
        switch (this.f149396f) {
            case 0:
                if (f149395i.equals(obj) && (obj2 = this.f149398h) != null) {
                    obj = obj2;
                }
                return this.f247672e.mo26650b(obj);
            default:
                return super.mo26650b(obj);
        }
    }

    @Override // p204p.w400, p204p.qp71
    /* JADX INFO: renamed from: f */
    public final bp71 mo26651f(int i, bp71 bp71Var, boolean z) {
        switch (this.f149396f) {
            case 0:
                this.f247672e.mo26651f(i, bp71Var, z);
                if (Objects.equals(bp71Var.f29344b, this.f149398h) && z) {
                    bp71Var.f29344b = f149395i;
                }
                return bp71Var;
            default:
                hz31 hz31Var = (hz31) this.f149398h;
                long j = hz31Var.f96777Z;
                bp71 bp71VarMo26651f = ((qp71) this.f149397g).mo26651f(i, bp71Var, z);
                c95.m31856v(bp71VarMo26651f.f29347e <= 0, "SpeedChangingMediaSource does not support Period instances starting after their Window.");
                if (bp71VarMo26651f.f29346d != -9223372036854775807L) {
                    c95.m31855u(j == (-bp71VarMo26651f.f29347e));
                    bp71VarMo26651f.f29346d = hz31.m49221K(bp71VarMo26651f.f29346d, hz31Var.f96776Y, j);
                }
                return bp71VarMo26651f;
        }
    }

    @Override // p204p.w400, p204p.qp71
    /* JADX INFO: renamed from: l */
    public Object mo26653l(int i) {
        switch (this.f149396f) {
            case 0:
                Object objMo26653l = this.f247672e.mo26653l(i);
                return Objects.equals(objMo26653l, this.f149398h) ? f149395i : objMo26653l;
            default:
                return super.mo26653l(i);
        }
    }

    @Override // p204p.w400, p204p.qp71
    /* JADX INFO: renamed from: n */
    public final mp71 mo26654n(int i, mp71 mp71Var, long j) {
        switch (this.f149396f) {
            case 0:
                this.f247672e.mo26654n(i, mp71Var, j);
                if (Objects.equals(mp71Var.f145926a, this.f149397g)) {
                    mp71Var.f145926a = mp71.f145916q;
                }
                return mp71Var;
            default:
                mp71 mp71VarMo26654n = ((qp71) this.f149397g).mo26654n(i, mp71Var, j);
                c95.m31856v(mp71VarMo26654n.f145939n == mp71VarMo26654n.f145940o, "SpeedChangingMediaSource does not support multiple Period instances per Window.");
                long j2 = mp71VarMo26654n.f145938m;
                if (j2 != -9223372036854775807L) {
                    mp71VarMo26654n.f145938m = ((hz31) this.f149398h).f96776Y.m27473i(j2);
                }
                return mp71VarMo26654n;
        }
    }

    public n1d0(qp71 qp71Var, Object obj, Object obj2) {
        super(qp71Var);
        this.f149397g = obj;
        this.f149398h = obj2;
    }
}
