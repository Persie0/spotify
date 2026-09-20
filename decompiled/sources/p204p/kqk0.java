package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class kqk0 {

    /* JADX INFO: renamed from: a */
    public final boolean f125325a;

    /* JADX INFO: renamed from: b */
    public final boolean f125326b;

    /* JADX INFO: renamed from: c */
    public final boolean f125327c;

    /* JADX INFO: renamed from: d */
    public final boolean f125328d;

    /* JADX INFO: renamed from: e */
    public final boolean f125329e;

    /* JADX INFO: renamed from: f */
    public final int f125330f;

    /* JADX INFO: renamed from: g */
    public final int f125331g;

    /* JADX INFO: renamed from: h */
    public final int f125332h;

    /* JADX INFO: renamed from: i */
    public final int f125333i;

    /* JADX INFO: renamed from: j */
    public final boolean f125334j;

    /* JADX INFO: renamed from: k */
    public final int f125335k;

    /* JADX INFO: renamed from: l */
    public final boolean f125336l;

    /* JADX INFO: renamed from: m */
    public final boolean f125337m;

    /* JADX INFO: renamed from: n */
    public final boolean f125338n;

    /* JADX INFO: renamed from: o */
    public final boolean f125339o;

    /* JADX INFO: renamed from: p */
    public final boolean f125340p;

    /* JADX INFO: renamed from: q */
    public final int f125341q;

    /* JADX INFO: renamed from: r */
    public final byte f125342r;

    /* JADX INFO: renamed from: s */
    public final byte f125343s;

    /* JADX INFO: renamed from: t */
    public final byte f125344t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public kqk0(jqk0 jqk0Var) {
        int iM66954g;
        int iM66954g2;
        boolean zM66953f;
        ?? r8;
        int i = jqk0Var.f114922a;
        ByteBuffer byteBuffer = jqk0Var.f114923b;
        c95.m31843i(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        ohc ohcVar = new ohc(bArr, iRemaining);
        this.f125331g = ohcVar.m66954g(3);
        ohcVar.m66961n();
        boolean zM66953f2 = ohcVar.m66953f();
        this.f125325a = zM66953f2;
        if (zM66953f2) {
            iM66954g2 = ohcVar.m66954g(5);
            this.f125326b = false;
            this.f125334j = false;
            r8 = 0;
            iM66954g = 0;
        } else {
            if (ohcVar.m66953f()) {
                ohcVar.m66962o(64);
                if (ohcVar.m66953f()) {
                    int i2 = 0;
                    while (!ohcVar.m66953f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        ohcVar.m66962o(i2);
                    }
                }
                boolean zM66953f3 = ohcVar.m66953f();
                this.f125326b = zM66953f3;
                if (zM66953f3) {
                    ohcVar.m66962o(47);
                }
            } else {
                this.f125326b = false;
            }
            this.f125334j = ohcVar.m66953f();
            int iM66954g3 = ohcVar.m66954g(5);
            int iM66954g4 = 0;
            int i3 = 0;
            boolean z = false;
            iM66954g = 0;
            while (i3 <= iM66954g3) {
                ohcVar.m66962o(12);
                if (i3 == 0) {
                    iM66954g4 = ohcVar.m66954g(5);
                    if (iM66954g4 > 7) {
                        zM66953f = z;
                        zM66953f = ohcVar.m66953f();
                    }
                } else if (ohcVar.m66954g(5) > 7) {
                    zM66953f = z;
                    ohcVar.m66961n();
                    zM66953f = z;
                }
                zM66953f = z;
                zM66953f = z;
                if (this.f125326b) {
                    ohcVar.m66961n();
                }
                if (this.f125334j && ohcVar.m66953f()) {
                    if (i3 == 0) {
                        iM66954g = ohcVar.m66954g(4);
                    } else {
                        ohcVar.m66962o(4);
                    }
                }
                i3++;
                z = zM66953f;
            }
            iM66954g2 = iM66954g4;
            r8 = z;
        }
        int iM66954g5 = ohcVar.m66954g(4);
        int iM66954g6 = ohcVar.m66954g(4);
        ohcVar.m66962o(iM66954g5 + 1);
        ohcVar.m66962o(iM66954g6 + 1);
        if (this.f125325a) {
            this.f125327c = false;
        } else {
            this.f125327c = ohcVar.m66953f();
        }
        if (this.f125327c) {
            ohcVar.m66962o(4);
            ohcVar.m66962o(3);
        }
        ohcVar.m66962o(3);
        if (this.f125325a) {
            this.f125329e = true;
            this.f125328d = true;
            this.f125330f = 0;
        } else {
            ohcVar.m66962o(4);
            boolean zM66953f4 = ohcVar.m66953f();
            if (zM66953f4) {
                ohcVar.m66962o(2);
            }
            if (ohcVar.m66953f()) {
                this.f125328d = true;
            } else {
                this.f125328d = ohcVar.m66953f();
            }
            if (!this.f125328d || ohcVar.m66953f()) {
                this.f125329e = true;
            } else {
                this.f125329e = ohcVar.m66953f();
            }
            if (zM66953f4) {
                this.f125330f = ohcVar.m66954g(3) + 1;
            } else {
                this.f125330f = 0;
            }
        }
        this.f125332h = iM66954g2;
        this.f125333i = r8;
        this.f125335k = iM66954g;
        ohcVar.m66962o(3);
        boolean zM66953f5 = ohcVar.m66953f();
        this.f125336l = zM66953f5;
        if (this.f125331g == 2 && zM66953f5) {
            this.f125337m = ohcVar.m66953f();
        } else {
            this.f125337m = false;
        }
        if (this.f125331g != 1) {
            this.f125338n = ohcVar.m66953f();
        } else {
            this.f125338n = false;
        }
        if (ohcVar.m66953f()) {
            this.f125342r = (byte) ohcVar.m66954g(8);
            this.f125343s = (byte) ohcVar.m66954g(8);
            this.f125344t = (byte) ohcVar.m66954g(8);
        } else {
            this.f125342r = (byte) 0;
            this.f125343s = (byte) 0;
            this.f125344t = (byte) 0;
        }
        if (this.f125338n) {
            ohcVar.m66961n();
            this.f125339o = false;
            this.f125340p = false;
            this.f125341q = 0;
        } else if (this.f125342r == 1 && this.f125343s == 13 && this.f125344t == 0) {
            this.f125339o = false;
            this.f125340p = false;
            this.f125341q = 0;
        } else {
            ohcVar.m66961n();
            int i4 = this.f125331g;
            if (i4 == 0) {
                this.f125339o = true;
                this.f125340p = true;
            } else if (i4 == 1) {
                this.f125339o = false;
                this.f125340p = false;
            } else if (this.f125337m) {
                boolean zM66953f6 = ohcVar.m66953f();
                this.f125339o = zM66953f6;
                if (zM66953f6) {
                    this.f125340p = ohcVar.m66953f();
                } else {
                    this.f125340p = false;
                }
            } else {
                this.f125339o = true;
                this.f125340p = false;
            }
            if (this.f125339o && this.f125340p) {
                this.f125341q = ohcVar.m66954g(2);
            } else {
                this.f125341q = 0;
            }
        }
        ohcVar.m66961n();
    }
}
