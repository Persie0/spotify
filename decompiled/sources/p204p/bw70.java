package p204p;

/* JADX INFO: loaded from: classes.dex */
public abstract class bw70 {

    /* JADX INFO: renamed from: a */
    public static final float f31572a = 2500;

    /* JADX INFO: renamed from: b */
    public static final float f31573b = 1500;

    /* JADX INFO: renamed from: c */
    public static final float f31574c = 50;

    /* JADX WARN: Code duplicated, block: B:35:0x00c4 A[Catch: zr50 -> 0x01a7, TryCatch #5 {zr50 -> 0x01a7, blocks: (B:33:0x00c0, B:35:0x00c4, B:37:0x00ca, B:51:0x00f8, B:55:0x0122, B:59:0x012a), top: B:107:0x00c0 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x011f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x0128  */
    /* JADX WARN: Code duplicated, block: B:68:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0178 -> B:18:0x0060). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public static final java.lang.Object m30656a(p204p.yv70 r28, int r29, int r30, int r31, p204p.yqq r32, p204p.ibk r33) {
        /*
            Method dump skipped, instruction units count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p204p.bw70.m30656a(p.yv70, int, int, int, p.yqq, p.ibk):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m30657b(boolean z, yv70 yv70Var, int i, int i2) {
        if (z) {
            if (yv70Var.mo65248h() > i) {
                return true;
            }
            return yv70Var.mo65248h() == i && yv70Var.mo65247g() > i2;
        }
        if (yv70Var.mo65248h() < i) {
            return true;
        }
        return yv70Var.mo65248h() == i && yv70Var.mo65247g() < i2;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m30658c(yv70 yv70Var, int i) {
        return i <= yv70Var.mo65244b() && yv70Var.mo65248h() <= i;
    }
}
