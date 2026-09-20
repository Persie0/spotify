package p204p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;

/* JADX INFO: loaded from: classes7.dex */
public final class jio extends DataSectionStatus {

    /* JADX INFO: renamed from: a */
    public final String f112803a;

    public jio(String str) {
        super(null);
        this.f112803a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jio) && wj50.m88271j(this.f112803a, ((jio) obj).f112803a);
    }

    public final int hashCode() {
        return this.f112803a.hashCode();
    }
}
