package p204p;

import com.spotify.lyrics.serviceretrofit.proto.p105v3.LyricsV3Response;
import com.spotify.lyrics.serviceretrofit.proto.p105v3.LyricsWrapperResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class vqb0 {
    /* JADX INFO: renamed from: a */
    public static final s7f m86205a(LyricsWrapperResponse lyricsWrapperResponse) {
        int i;
        ae50<LyricsV3Response.LyricsLine> ae50VarM13357q = lyricsWrapperResponse.m13375o().m13357q();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM13357q, 10));
        for (LyricsV3Response.LyricsLine lyricsLine : ae50VarM13357q) {
            long jM13364n = lyricsLine.m13364n();
            String strM13366p = lyricsLine.m13366p();
            ae50<LyricsV3Response.LyricsLine.SyncData> ae50VarM13365o = lyricsLine.m13365o();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM13365o, 10));
            for (LyricsV3Response.LyricsLine.SyncData syncData : ae50VarM13365o) {
                arrayList2.add(new tab0((int) syncData.m13368o(), (int) syncData.m13367n()));
            }
            arrayList.add(new rab0(jM13364n, strM13366p, arrayList2));
        }
        int iOrdinal = lyricsWrapperResponse.m13375o().m13359s().ordinal();
        int i2 = 3;
        if (iOrdinal == 0) {
            i = 1;
        } else if (iOrdinal == 1) {
            i = 2;
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 1;
        } else {
            i = 3;
        }
        LyricsV3Response.Translation translationM13360t = lyricsWrapperResponse.m13375o().m13360t();
        List listSingletonList = translationM13360t.equals(LyricsV3Response.Translation.m13371n()) ? lau.f131415a : Collections.singletonList(new uab0(translationM13360t.m13372o().m13362n(), translationM13360t.m13373p(), translationM13360t.m13372o().m13363p()));
        String strM13362n = lyricsWrapperResponse.m13375o().m13356p().m13362n();
        boolean zM13363p = lyricsWrapperResponse.m13375o().m13356p().m13363p();
        List list = listSingletonList;
        sab0 sab0Var = new sab0(lyricsWrapperResponse.m13375o().m13358r().m13370o(), lyricsWrapperResponse.m13375o().m13358r().getName(), lyricsWrapperResponse.m13375o().m13358r().getDisplayName());
        vab0 vab0Var = new vab0(lyricsWrapperResponse.m13374n());
        int iOrdinal2 = lyricsWrapperResponse.m13375o().m13355n().ordinal();
        if (iOrdinal2 == 0) {
            i2 = 1;
        } else if (iOrdinal2 == 1) {
            i2 = 2;
        } else if (iOrdinal2 != 2) {
            if (iOrdinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 1;
        }
        return new s7f(arrayList, i, list, strM13362n, zM13363p, sab0Var, vab0Var, i2, new sbb0(yq20.m94324e("FF353535"), yq20.m94324e("FF565656"), yq20.m94324e("FFFFFFFF"), yq20.m94324e("FFCDCDCD"), yq20.m94324e("FF1ED760"), true), 256);
    }
}
