package p204p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;

/* JADX INFO: loaded from: classes7.dex */
public final class eeo implements heo {

    /* JADX INFO: renamed from: a */
    public final DataSectionType f58824a;

    public eeo(DataSectionType dataSectionType) {
        this.f58824a = dataSectionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eeo) && this.f58824a == ((eeo) obj).f58824a;
    }

    public final int hashCode() {
        return this.f58824a.hashCode();
    }
}
