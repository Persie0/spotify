package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class s3s {

    /* JADX INFO: renamed from: a */
    public final qas f205325a;

    /* JADX INFO: renamed from: b */
    public final String f205326b;

    /* JADX INFO: renamed from: c */
    public final String f205327c;

    /* JADX INFO: renamed from: d */
    public final u3s f205328d;

    /* JADX INFO: renamed from: e */
    public final u3s f205329e;

    /* JADX INFO: renamed from: f */
    public final u3s f205330f;

    /* JADX INFO: renamed from: g */
    public final u3s f205331g;

    public s3s(qas qasVar, String str, String str2, u3s u3sVar, u3s u3sVar2, u3s u3sVar3, u3s u3sVar4) {
        this.f205325a = qasVar;
        this.f205326b = str;
        this.f205327c = str2;
        this.f205328d = u3sVar;
        this.f205329e = u3sVar2;
        this.f205330f = u3sVar3;
        this.f205331g = u3sVar4;
    }

    /* JADX INFO: renamed from: a */
    public final u3s m77142a() {
        return this.f205329e;
    }

    /* JADX INFO: renamed from: b */
    public final u3s m77143b() {
        return this.f205328d;
    }

    /* JADX INFO: renamed from: c */
    public final u3s m77144c() {
        return this.f205331g;
    }

    /* JADX INFO: renamed from: d */
    public final String m77145d() {
        return this.f205326b;
    }

    /* JADX INFO: renamed from: e */
    public final u3s m77146e() {
        return this.f205330f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s3s)) {
            return false;
        }
        s3s s3sVar = (s3s) obj;
        return wj50.m88271j(this.f205325a, s3sVar.f205325a) && wj50.m88271j(this.f205326b, s3sVar.f205326b) && wj50.m88271j(this.f205327c, s3sVar.f205327c) && wj50.m88271j(this.f205328d, s3sVar.f205328d) && wj50.m88271j(this.f205329e, s3sVar.f205329e) && wj50.m88271j(this.f205330f, s3sVar.f205330f) && wj50.m88271j(this.f205331g, s3sVar.f205331g);
    }

    /* JADX INFO: renamed from: f */
    public final qas m77147f() {
        return this.f205325a;
    }

    public final int hashCode() {
        int iM77243b = s571.m77243b(this.f205325a.hashCode() * 31, 31, this.f205326b);
        String str = this.f205327c;
        return this.f205331g.hashCode() + ((this.f205330f.hashCode() + ((this.f205329e.hashCode() + ((this.f205328d.hashCode() + ((iM77243b + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31);
    }
}
