package p204p;

import com.spotify.music.R;

/* JADX INFO: loaded from: classes4.dex */
public final class qy1 implements ty1 {
    @Override // p204p.ty1
    /* JADX INFO: renamed from: c */
    public final ky1 mo74151c() {
        return null;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof qy1);
    }

    @Override // p204p.ty1
    public final String getId() {
        return "report_confirmation";
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.ads_report_confirmation_subtitle) + mt60.m62800g(R.string.ads_report_confirmation_title, 1713764000 * 31, 31);
    }
}
