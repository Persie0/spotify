package p204p;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class o08 extends adl {

    /* JADX INFO: renamed from: a */
    public final Context f160259a;

    /* JADX INFO: renamed from: b */
    public final wre f160260b;

    /* JADX INFO: renamed from: c */
    public final wre f160261c;

    /* JADX INFO: renamed from: d */
    public final String f160262d;

    public o08(Context context, wre wreVar, wre wreVar2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f160259a = context;
        if (wreVar == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.f160260b = wreVar;
        if (wreVar2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.f160261c = wreVar2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.f160262d = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof adl) {
            o08 o08Var = (o08) ((adl) obj);
            if (this.f160259a.equals(o08Var.f160259a) && this.f160260b.equals(o08Var.f160260b) && this.f160261c.equals(o08Var.f160261c) && this.f160262d.equals(o08Var.f160262d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f160259a.hashCode() ^ 1000003) * 1000003) ^ this.f160260b.hashCode()) * 1000003) ^ this.f160261c.hashCode()) * 1000003) ^ this.f160262d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f160259a);
        sb.append(", wallClock=");
        sb.append(this.f160260b);
        sb.append(", monotonicClock=");
        sb.append(this.f160261c);
        sb.append(", backendName=");
        return dq60.m36616p(this.f160262d, "}", sb);
    }
}
