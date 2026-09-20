package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class qki implements sli {

    /* JADX INFO: renamed from: a */
    public final String f189560a;

    /* JADX INFO: renamed from: b */
    public final String f189561b;

    /* JADX INFO: renamed from: c */
    public final String f189562c;

    /* JADX INFO: renamed from: d */
    public final String f189563d;

    /* JADX INFO: renamed from: e */
    public final ae50 f189564e;

    public qki(String str, String str2, String str3, String str4, ae50 ae50Var) {
        this.f189560a = str;
        this.f189561b = str2;
        this.f189562c = str3;
        this.f189563d = str4;
        this.f189564e = ae50Var;
    }

    /* JADX INFO: renamed from: a */
    public final List m73123a() {
        return this.f189564e;
    }

    /* JADX INFO: renamed from: b */
    public final String m73124b() {
        return this.f189563d;
    }

    /* JADX INFO: renamed from: c */
    public final String m73125c() {
        return this.f189562c;
    }

    /* JADX INFO: renamed from: d */
    public final String m73126d() {
        return this.f189560a;
    }

    /* JADX INFO: renamed from: e */
    public final String m73127e() {
        return this.f189561b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qki)) {
            return false;
        }
        qki qkiVar = (qki) obj;
        return this.f189560a.equals(qkiVar.f189560a) && this.f189561b.equals(qkiVar.f189561b) && this.f189562c.equals(qkiVar.f189562c) && wj50.m88271j(this.f189563d, qkiVar.f189563d) && this.f189564e.equals(qkiVar.f189564e);
    }

    public final int hashCode() {
        return this.f189564e.hashCode() + s571.m77243b(s571.m77243b(s571.m77243b(this.f189560a.hashCode() * 31, 31, this.f189561b), 31, this.f189562c), 31, this.f189563d);
    }
}
