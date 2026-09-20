package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qey extends rey {

    /* JADX INFO: renamed from: a */
    public final String f188056a;

    /* JADX INFO: renamed from: b */
    public final boolean f188057b;

    public qey(String str, boolean z) {
        this.f188056a = str;
        this.f188057b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qey)) {
            return false;
        }
        qey qeyVar = (qey) obj;
        return wj50.m88271j(this.f188056a, qeyVar.f188056a) && this.f188057b == qeyVar.f188057b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f188057b) + (this.f188056a.hashCode() * 31);
    }

    public /* synthetic */ qey() {
        this("generate", false);
    }
}
