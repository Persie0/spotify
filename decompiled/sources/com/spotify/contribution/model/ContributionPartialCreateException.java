package com.spotify.contribution.model;

import java.util.ArrayList;
import kotlin.Metadata;
import p204p.dq60;
import p204p.g6f;
import p204p.whk;
import p204p.xhk;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m24211d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, m24212d2 = {"Lcom/spotify/contribution/model/ContributionPartialCreateException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "p/xhk", "src_main_java_com_spotify_contribution_model-model"}, m24213k = 1, m24214mv = {2, 3, 0}, m24216xi = 48)
public final class ContributionPartialCreateException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ContributionPartialCreateException(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        int size2 = arrayList2.size() + arrayList.size();
        String strM43753y0 = g6f.m43753y0(arrayList2, null, null, null, whk.f251387b, 31);
        StringBuilder sbM36619s = dq60.m36619s(size, size2, "Created ", " of ", " contributions; failed: ");
        sbM36619s.append(strM43753y0);
        String string = sbM36619s.toString();
        xhk xhkVar = (xhk) g6f.m43745s0(arrayList2);
        super(string, xhkVar != null ? xhkVar.f261663b : null);
    }
}
