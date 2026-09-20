package p204p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;
import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionType;

/* JADX INFO: loaded from: classes7.dex */
public final class hio {

    /* JADX INFO: renamed from: a */
    public final DataSectionType f91850a;

    /* JADX INFO: renamed from: b */
    public final DataSectionStatus f91851b;

    public hio(DataSectionType dataSectionType, DataSectionStatus dataSectionStatus) {
        this.f91850a = dataSectionType;
        this.f91851b = dataSectionStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hio)) {
            return false;
        }
        hio hioVar = (hio) obj;
        return this.f91850a == hioVar.f91850a && wj50.m88271j(this.f91851b, hioVar.f91851b);
    }

    public final int hashCode() {
        return this.f91851b.hashCode() + (this.f91850a.hashCode() * 31);
    }
}
