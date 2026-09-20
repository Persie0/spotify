package androidx.car.app.media.model;

import androidx.car.app.model.Banner;
import androidx.car.app.model.Header;
import java.util.Objects;
import p204p.rkd0;
import p204p.rzb;
import p204p.ty61;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public class MediaPlaybackTemplate implements ty61 {
    private final Banner mBanner;
    private final Header mHeader;

    private MediaPlaybackTemplate() {
        this.mHeader = null;
        this.mBanner = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPlaybackTemplate)) {
            return false;
        }
        MediaPlaybackTemplate mediaPlaybackTemplate = (MediaPlaybackTemplate) obj;
        return Objects.equals(this.mHeader, mediaPlaybackTemplate.mHeader) && Objects.equals(this.mBanner, mediaPlaybackTemplate.mBanner);
    }

    public Banner getBanner() {
        return this.mBanner;
    }

    public Header getHeader() {
        return this.mHeader;
    }

    public int hashCode() {
        return Objects.hash(this.mHeader, this.mBanner);
    }

    public String toString() {
        return "MediaPlaybackTemplate";
    }

    public MediaPlaybackTemplate(rkd0 rkd0Var) {
        this.mHeader = rkd0Var.f200055a;
        this.mBanner = null;
    }
}
