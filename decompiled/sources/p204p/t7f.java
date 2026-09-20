package p204p;

import com.spotify.lyrics.serviceretrofit.proto.ColorLyricsResponse;
import com.spotify.lyrics.serviceretrofit.proto.LyricsResponse;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class t7f {
    /* JADX INFO: renamed from: a */
    public static final s7f m80217a(ColorLyricsResponse colorLyricsResponse) {
        int i;
        ae50<LyricsResponse.LyricsLine> ae50VarM13341r = colorLyricsResponse.m13332p().m13341r();
        ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM13341r, 10));
        for (LyricsResponse.LyricsLine lyricsLine : ae50VarM13341r) {
            long jM13349n = lyricsLine.m13349n();
            String strM13351p = lyricsLine.m13351p();
            ae50<LyricsResponse.LyricsLine.Syllable> ae50VarM13350o = lyricsLine.m13350o();
            ArrayList arrayList2 = new ArrayList(i6f.m49804T(ae50VarM13350o, 10));
            for (LyricsResponse.LyricsLine.Syllable syllable : ae50VarM13350o) {
                arrayList2.add(new tab0((int) syllable.m13353o(), (int) syllable.m13352n()));
            }
            arrayList.add(new rab0(jM13349n, strM13351p, arrayList2));
        }
        int iOrdinal = colorLyricsResponse.m13332p().m13345v().ordinal();
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
        ae50<LyricsResponse.Alternative> ae50VarM13338n = colorLyricsResponse.m13332p().m13338n();
        ArrayList arrayList3 = new ArrayList(i6f.m49804T(ae50VarM13338n, 10));
        for (LyricsResponse.Alternative alternative : ae50VarM13338n) {
            arrayList3.add(new uab0(alternative.getLanguage(), alternative.m13348o(), alternative.m13347n()));
        }
        String language = colorLyricsResponse.m13332p().getLanguage();
        boolean zM13340q = colorLyricsResponse.m13332p().m13340q();
        sab0 sab0Var = new sab0(colorLyricsResponse.m13332p().m13344u(), colorLyricsResponse.m13332p().m13342s(), colorLyricsResponse.m13332p().m13343t());
        vab0 vab0Var = new vab0(colorLyricsResponse.m13331o());
        int iOrdinal2 = colorLyricsResponse.m13332p().m13339o().ordinal();
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
        ae50 ae50VarM13346w = colorLyricsResponse.m13332p().m13346w();
        int iM13334n = colorLyricsResponse.m13330n().m13334n();
        int iM13336q = colorLyricsResponse.m13330n().m13336q();
        int iM13335p = colorLyricsResponse.m13330n().m13335p();
        return new s7f(arrayList, i, arrayList3, language, zM13340q, sab0Var, vab0Var, i2, ae50VarM13346w, new sbb0(iM13334n, iM13334n, iM13335p, iM13336q, iM13335p, false));
    }
}
