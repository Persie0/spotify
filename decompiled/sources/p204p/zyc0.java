package p204p;

/* JADX INFO: loaded from: classes8.dex */
public final class zyc0 implements nzc0 {

    /* JADX INFO: renamed from: a */
    public final String f287550a;

    public zyc0(String str) {
        this.f287550a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zyc0) && wj50.m88271j(this.f287550a, ((zyc0) obj).f287550a);
    }

    @Override // p204p.nzc0
    public final String getId() {
        return this.f287550a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f287550a.hashCode() * 29791);
    }
}
