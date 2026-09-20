package p204p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class q1b1 {

    /* JADX INFO: renamed from: a */
    public final p1b1 f184283a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f184284b;

    /* JADX INFO: renamed from: c */
    public int f184285c;

    /* JADX INFO: renamed from: d */
    public short f184286d;

    /* JADX INFO: renamed from: e */
    public short f184287e;

    public q1b1() {
        this.f184285c = -1;
        this.f184283a = p1b1.f173029i;
    }

    /* JADX INFO: renamed from: a */
    public final void m71920a() {
        int i = this.f184285c;
        if (i >= 0) {
            if (i > this.f184284b.position()) {
                throw new IllegalStateException("Internal error: last_instruction_start past end of instructions_and_sizes in unGetInstruction");
            }
            this.f184284b.position(this.f184285c);
            if (this.f184286d != 256 && this.f184287e != 256) {
                throw new IllegalStateException("Internal error: two pending instructions in a row in unGetInstruction");
            }
            this.f184286d = this.f184287e;
        }
    }

    public q1b1(p1b1 p1b1Var, short s) {
        String str;
        int i;
        this.f184285c = -1;
        xra0 xra0Var = p1b1.f173028h;
        byte[] bArr = p1b1Var.f173032b;
        byte[] bArr2 = p1b1Var.f173035e;
        byte[] bArr3 = p1b1Var.f173033c;
        byte[] bArr4 = p1b1Var.f173031a;
        int i2 = s + 4;
        boolean[] zArr = new boolean[259];
        for (int i3 = 0; i3 < i2; i3++) {
            zArr[i3] = false;
        }
        boolean z = true;
        for (int i4 = 0; i4 < 256; i4++) {
            z = p1b1.m68783b(i4, (short) (bArr[i4] & 255), (short) (p1b1Var.f173034d[i4] & 255), (short) (p1b1Var.f173036f[i4] & 255), s, "second") && (p1b1.m68783b(i4, (short) (bArr4[i4] & 255), (short) (bArr3[i4] & 255), (short) (bArr2[i4] & 255), s, "first") && z);
            if (bArr3[i4] == 0 && bArr[i4] == 0 && (i = (bArr4[i4] & 255) + (bArr2[i4] & 255)) < i2) {
                zArr[i] = true;
            }
        }
        for (int i5 = 0; i5 < i2; i5++) {
            if (i5 != 0 && !zArr[i5]) {
                if (i5 >= 3) {
                    xra0Var.mo27142m(Integer.valueOf(i5 - 3), "VCDiff: Bad code table; there is no opcode for inst COPY, size 0, mode {}");
                } else {
                    if (i5 == 0) {
                        str = "NOOP";
                    } else if (i5 == 1) {
                        str = "ADD";
                    } else if (i5 == 2) {
                        str = "RUN";
                    } else if (i5 != 3) {
                        str = "";
                    } else {
                        str = "COPY";
                    }
                    xra0Var.mo27142m(str, "VCDiff: Bad code table; there is no opcode for inst {}, size -,  mode 0");
                }
                z = false;
            }
        }
        if (z) {
            this.f184283a = p1b1Var;
            return;
        }
        throw new IllegalArgumentException("Invalid code table data.");
    }
}
