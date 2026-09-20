package p204p;

import com.spotify.genalphagraduation.datadownload.page.domain.DataSectionStatus;

/* JADX INFO: loaded from: classes7.dex */
public final class iio extends DataSectionStatus {

    /* JADX INFO: renamed from: a */
    public final String f102610a;

    /* JADX INFO: renamed from: b */
    public final String f102611b;

    /* JADX INFO: renamed from: c */
    public final String f102612c;

    public iio(String str, String str2, String str3) {
        super(null);
        this.f102610a = str;
        this.f102611b = str2;
        this.f102612c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iio)) {
            return false;
        }
        iio iioVar = (iio) obj;
        return wj50.m88271j(this.f102610a, iioVar.f102610a) && wj50.m88271j(this.f102611b, iioVar.f102611b) && wj50.m88271j(this.f102612c, iioVar.f102612c);
    }

    public final int hashCode() {
        return this.f102612c.hashCode() + s571.m77243b(this.f102610a.hashCode() * 31, 31, this.f102611b);
    }
}
