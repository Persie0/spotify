package p204p;

import android.graphics.Color;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class uqm0 {

    /* JADX INFO: renamed from: a */
    public final int f233078a;

    /* JADX INFO: renamed from: b */
    public final int f233079b;

    /* JADX INFO: renamed from: c */
    public final int f233080c;

    /* JADX INFO: renamed from: d */
    public final int f233081d;

    /* JADX INFO: renamed from: e */
    public final int f233082e;

    /* JADX INFO: renamed from: f */
    public boolean f233083f;

    /* JADX INFO: renamed from: g */
    public int f233084g;

    /* JADX INFO: renamed from: h */
    public int f233085h;

    /* JADX INFO: renamed from: i */
    public float[] f233086i;

    public uqm0(int i, int i2) {
        this.f233078a = Color.red(i);
        this.f233079b = Color.green(i);
        this.f233080c = Color.blue(i);
        this.f233081d = i;
        this.f233082e = i2;
    }

    /* JADX INFO: renamed from: a */
    public final void m83806a() {
        if (this.f233083f) {
            return;
        }
        int i = this.f233081d;
        int iM61219g = m9f.m61219g(-1, i, 4.5f);
        int iM61219g2 = m9f.m61219g(-1, i, 3.0f);
        if (iM61219g != -1 && iM61219g2 != -1) {
            this.f233085h = m9f.m61224l(-1, iM61219g);
            this.f233084g = m9f.m61224l(-1, iM61219g2);
            this.f233083f = true;
            return;
        }
        int iM61219g3 = m9f.m61219g(-16777216, i, 4.5f);
        int iM61219g4 = m9f.m61219g(-16777216, i, 3.0f);
        if (iM61219g3 == -1 || iM61219g4 == -1) {
            this.f233085h = iM61219g != -1 ? m9f.m61224l(-1, iM61219g) : m9f.m61224l(-16777216, iM61219g3);
            this.f233084g = iM61219g2 != -1 ? m9f.m61224l(-1, iM61219g2) : m9f.m61224l(-16777216, iM61219g4);
            this.f233083f = true;
        } else {
            this.f233085h = m9f.m61224l(-16777216, iM61219g3);
            this.f233084g = m9f.m61224l(-16777216, iM61219g4);
            this.f233083f = true;
        }
    }

    /* JADX INFO: renamed from: b */
    public final float[] m83807b() {
        if (this.f233086i == null) {
            this.f233086i = new float[3];
        }
        m9f.m61214b(this.f233078a, this.f233079b, this.f233080c, this.f233086i);
        return this.f233086i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uqm0.class == obj.getClass()) {
            uqm0 uqm0Var = (uqm0) obj;
            if (this.f233082e == uqm0Var.f233082e && this.f233081d == uqm0Var.f233081d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f233081d * 31) + this.f233082e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(uqm0.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.f233081d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(m83807b()));
        sb.append("] [Population: ");
        sb.append(this.f233082e);
        sb.append("] [Title Text: #");
        m83806a();
        sb.append(Integer.toHexString(this.f233084g));
        sb.append("] [Body Text: #");
        m83806a();
        sb.append(Integer.toHexString(this.f233085h));
        sb.append(']');
        return sb.toString();
    }
}
