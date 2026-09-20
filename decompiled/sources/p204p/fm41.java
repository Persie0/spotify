package p204p;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class fm41 {

    /* JADX INFO: renamed from: a */
    public final Object f70952a;

    public fm41(List list) {
        this.f70952a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fm41) && this.f70952a.equals(((fm41) obj).f70952a);
    }

    public final int hashCode() {
        return this.f70952a.hashCode();
    }
}
