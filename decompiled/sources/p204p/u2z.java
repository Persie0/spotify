package p204p;

import com.spotify.puffin.core.data.filtermetadata.database.FilterMetadataDatabase_Impl;

/* JADX INFO: loaded from: classes10.dex */
public final class u2z extends qe70 implements eh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f226201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FilterMetadataDatabase_Impl f226202b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u2z(FilterMetadataDatabase_Impl filterMetadataDatabase_Impl, int i) {
        super(0);
        this.f226201a = i;
        this.f226202b = filterMetadataDatabase_Impl;
    }

    @Override // p204p.eh00
    public final Object invoke() {
        switch (this.f226201a) {
            case 0:
                return new z3y(this.f226202b);
            case 1:
                return new f4y(this.f226202b);
            default:
                return new sx31(this.f226202b);
        }
    }
}
