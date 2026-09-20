package p204p;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k07 {

    /* JADX INFO: renamed from: a */
    public final int f117907a;

    /* JADX INFO: renamed from: b */
    public final int f117908b;

    /* JADX INFO: renamed from: c */
    public final int f117909c;

    /* JADX INFO: renamed from: d */
    public final boolean f117910d;

    /* JADX INFO: renamed from: e */
    public final boolean f117911e;

    /* JADX INFO: renamed from: f */
    public final int f117912f;

    /* JADX INFO: renamed from: g */
    public final xs6 f117913g;

    /* JADX INFO: renamed from: h */
    public final int f117914h;

    /* JADX INFO: renamed from: i */
    public final int f117915i;

    /* JADX INFO: renamed from: j */
    public final boolean f117916j;

    /* JADX INFO: renamed from: k */
    public final boolean f117917k;

    public k07(j07 j07Var) {
        this.f117907a = j07Var.f107367a;
        this.f117908b = j07Var.f107368b;
        this.f117909c = j07Var.f107369c;
        this.f117910d = j07Var.f107370d;
        this.f117911e = j07Var.f107371e;
        this.f117912f = j07Var.f107372f;
        this.f117913g = j07Var.f107373g;
        this.f117914h = j07Var.f107374h;
        this.f117915i = j07Var.f107375i;
        this.f117916j = j07Var.f107376j;
        this.f117917k = j07Var.f107377k;
    }

    /* JADX INFO: renamed from: a */
    public final j07 m54931a() {
        j07 j07Var = new j07();
        j07Var.f107367a = this.f117907a;
        j07Var.f107368b = this.f117908b;
        j07Var.f107369c = this.f117909c;
        j07Var.f107370d = this.f117910d;
        j07Var.f107371e = this.f117911e;
        j07Var.f107372f = this.f117912f;
        j07Var.f107373g = this.f117913g;
        j07Var.f107374h = this.f117914h;
        j07Var.f107375i = this.f117915i;
        j07Var.f107376j = this.f117916j;
        j07Var.f107377k = this.f117917k;
        return j07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k07.class != obj.getClass()) {
            return false;
        }
        k07 k07Var = (k07) obj;
        return this.f117907a == k07Var.f117907a && this.f117908b == k07Var.f117908b && this.f117909c == k07Var.f117909c && this.f117910d == k07Var.f117910d && this.f117911e == k07Var.f117911e && this.f117912f == k07Var.f117912f && this.f117914h == k07Var.f117914h && this.f117915i == k07Var.f117915i && this.f117916j == k07Var.f117916j && this.f117917k == k07Var.f117917k && this.f117913g.equals(k07Var.f117913g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f117907a), Integer.valueOf(this.f117908b), Integer.valueOf(this.f117909c), Boolean.valueOf(this.f117910d), Boolean.valueOf(this.f117911e), Integer.valueOf(this.f117912f), this.f117913g, Integer.valueOf(this.f117914h), Integer.valueOf(this.f117915i), Boolean.valueOf(this.f117917k), Boolean.valueOf(this.f117916j));
    }
}
