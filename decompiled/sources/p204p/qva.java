package p204p;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qva implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final char[] f192949a;

    /* JADX INFO: renamed from: b */
    public long f192950b = -1;

    /* JADX INFO: renamed from: c */
    public long f192951c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: d */
    public pva f192952d;

    public qva(char[] cArr) {
        this.f192949a = cArr;
    }

    @Override // 
    /* JADX INFO: renamed from: b */
    public qva clone() {
        try {
            qva qvaVar = (qva) super.clone();
            pva pvaVar = this.f192952d;
            if (pvaVar != null) {
                qvaVar.f192952d = pvaVar.mo71125b();
            }
            return qvaVar;
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m73978d() {
        String str = new String(this.f192949a);
        if (str.length() < 1) {
            return "";
        }
        long j = this.f192951c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.f192950b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        long j3 = this.f192950b;
        return str.substring((int) j3, ((int) j3) + 1);
    }

    /* JADX INFO: renamed from: e */
    public float mo73979e() {
        if (this instanceof sva) {
            return ((sva) this).mo73979e();
        }
        return Float.NaN;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qva)) {
            return false;
        }
        qva qvaVar = (qva) obj;
        if (this.f192950b == qvaVar.f192950b && this.f192951c == qvaVar.f192951c && Arrays.equals(this.f192949a, qvaVar.f192949a)) {
            return Objects.equals(this.f192952d, qvaVar.f192952d);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f192949a) * 31;
        long j = this.f192950b;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f192951c;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        pva pvaVar = this.f192952d;
        return (i2 + (pvaVar != null ? pvaVar.hashCode() : 0)) * 31;
    }

    /* JADX INFO: renamed from: i */
    public int mo73980i() {
        if (this instanceof sva) {
            return ((sva) this).mo73980i();
        }
        return 0;
    }

    /* JADX INFO: renamed from: j */
    public final String m73981j() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    /* JADX INFO: renamed from: l */
    public final void m73982l(long j) {
        if (this.f192951c != Long.MAX_VALUE) {
            return;
        }
        this.f192951c = j;
        pva pvaVar = this.f192952d;
        if (pvaVar != null) {
            pvaVar.m71126m(this);
        }
    }

    public String toString() {
        long j = this.f192950b;
        long j2 = this.f192951c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass());
            sb.append(" (INVALID, ");
            sb.append(this.f192950b);
            sb.append("-");
            return ikc0.m50938j(this.f192951c, ")", sb);
        }
        return m73981j() + " (" + this.f192950b + " : " + this.f192951c + ") <<" + new String(this.f192949a).substring((int) this.f192950b, ((int) this.f192951c) + 1) + ">>";
    }
}
