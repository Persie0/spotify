package com.spotify.widgets.colorextraction;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m24211d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m24212d2 = {"Lcom/spotify/widgets/colorextraction/ColorNotExtractedError;", "Ljava/io/IOException;", "src_main_java_com_spotify_widgets_colorextraction-colorextraction"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ColorNotExtractedError extends IOException {

    /* JADX INFO: renamed from: a */
    public final Throwable f6978a;

    public ColorNotExtractedError(Exception exc) {
        this.f6978a = exc;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        Throwable th = this.f6978a;
        if (th != null) {
            return th.getMessage();
        }
        return null;
    }
}
