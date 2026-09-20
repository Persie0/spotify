package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class byt {

    /* JADX INFO: renamed from: a */
    public static final im91 f32317a;

    /* JADX INFO: renamed from: b */
    public static final im91 f32318b;

    /* JADX INFO: renamed from: c */
    public static final im91 f32319c;

    static {
        yzl yzlVar = new yzl(0.4f, 0.0f, 0.6f, 1.0f);
        f32317a = new im91(120, iqs.f104839a, 2);
        f32318b = new im91(150, yzlVar, 2);
        f32319c = new im91(120, yzlVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0009 A[PHI: r1
      0x0009: PHI (r1v3 p.im91) = (r1v0 p.im91), (r1v0 p.im91), (r1v0 p.im91), (r1v4 p.im91), (r1v4 p.im91), (r1v4 p.im91), (r1v4 p.im91) binds: [B:19:0x0022, B:22:0x0027, B:28:0x0033, B:5:0x0007, B:8:0x000d, B:11:0x0012, B:14:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: a */
    public static final Object m30903a(gw4 gw4Var, float f, b650 b650Var, b650 b650Var2, ibk ibkVar) {
        im91 im91Var;
        im91 im91Var2 = null;
        if (b650Var2 != null) {
            boolean z = b650Var2 instanceof m3r0;
            im91Var = f32317a;
            if (z || (b650Var2 instanceof wds) || (b650Var2 instanceof gc30) || (b650Var2 instanceof gpz)) {
                im91Var2 = im91Var;
            }
        } else if (b650Var != null) {
            boolean z2 = b650Var instanceof m3r0;
            im91Var = f32318b;
            if (z2 || (b650Var instanceof wds)) {
                im91Var2 = im91Var;
            } else if (b650Var instanceof gc30) {
                im91Var2 = f32319c;
            } else if (b650Var instanceof gpz) {
                im91Var2 = im91Var;
            }
        }
        im91 im91Var3 = im91Var2;
        yuk yukVar = yuk.f276404a;
        if (im91Var3 != null) {
            Object objM45909c = gw4.m45909c(gw4Var, new ybs(f), im91Var3, null, null, ibkVar, 12);
            if (objM45909c == yukVar) {
                return objM45909c;
            }
        } else {
            Object objM45914g = gw4Var.m45914g(new ybs(f), ibkVar);
            if (objM45914g == yukVar) {
                return objM45914g;
            }
        }
        return w2a1.f247311a;
    }
}
