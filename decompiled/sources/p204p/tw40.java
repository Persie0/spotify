package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tw40 {

    /* JADX INFO: renamed from: a */
    public final boolean f224310a;

    public tw40(boolean z) {
        this.f224310a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tw40) {
            return this.f224310a == ((tw40) obj).f224310a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f224310a) * 31;
    }

    public final String toString() {
        return "InputTextSuggestionState(isCommittedByInputMethodEditor=" + this.f224310a;
    }
}
