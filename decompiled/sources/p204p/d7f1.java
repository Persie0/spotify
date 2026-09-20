package p204p;

import com.spotify.corex.readalong.p053v1.proto.ColourData;
import com.spotify.corex.readalong.p053v1.proto.TranscriptExcerpt;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class d7f1 implements Function, Predicate {

    /* JADX INFO: renamed from: c */
    public static final d7f1 f46186c;

    /* JADX INFO: renamed from: d */
    public static final d7f1 f46187d;

    /* JADX INFO: renamed from: e */
    public static final d7f1 f46188e;

    /* JADX INFO: renamed from: f */
    public static final d7f1 f46189f;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46190a;

    /* JADX INFO: renamed from: b */
    public final String f46191b;

    static {
        int i = 0;
        f46186c = new d7f1("TINK", i);
        f46187d = new d7f1("CRUNCHY", i);
        f46188e = new d7f1("LEGACY", i);
        f46189f = new d7f1("NO_PREFIX", i);
    }

    public /* synthetic */ d7f1(String str, int i) {
        this.f46190a = i;
        this.f46191b = str;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    /* JADX INFO: renamed from: apply */
    public Object mo98394apply(Object obj) {
        rhj rhjVar;
        switch (this.f46190a) {
            case 1:
                return ((gqx) obj).mo45449a(i43.class, this.f46191b);
            case 2:
                xdv xdvVar = (xdv) ((gqx) obj).mo45449a(xdv.class, this.f46191b).f72301b;
                return Boolean.valueOf((xdvVar != null ? xdvVar.f260544a : 0) == 2);
            case 3:
                return new qqm0(this.f46191b, ((usk) ((pqm0) obj).f180350a).f233645a);
            case 4:
                thj thjVar = (thj) ((gqx) obj).mo45449a(thj.class, this.f46191b).f72301b;
                return (thjVar == null || (rhjVar = thjVar.f220443a) == null) ? rhj.f199233a : rhjVar;
            case 5:
                return Boolean.valueOf(((List) obj).contains(this.f46191b));
            case 6:
            case 7:
            default:
                o2x0 o2x0Var = (o2x0) obj;
                TranscriptExcerpt transcriptExcerpt = (TranscriptExcerpt) o2x0Var.f161172b;
                n2x0 n2x0Var = o2x0Var.f161171a;
                if (!n2x0Var.f149852O0 || transcriptExcerpt == null) {
                    return Single.error(new Throwable(s571.m77246e(n2x0Var.f149860d, "Failed to fetch excerpts: ")));
                }
                String strM8054s = transcriptExcerpt.m8054s();
                String strM8052q = transcriptExcerpt.m8052q();
                String language = transcriptExcerpt.getLanguage();
                ae50<TranscriptExcerpt.Sentence> ae50VarM8053r = transcriptExcerpt.m8053r();
                ArrayList arrayList = new ArrayList(i6f.m49804T(ae50VarM8053r, 10));
                for (TranscriptExcerpt.Sentence sentence : ae50VarM8053r) {
                    arrayList.add(new osz0(sentence.m8056o(), sentence.m8055n()));
                }
                ColourData colourDataM8049n = transcriptExcerpt.m8049n();
                return Single.just(new k091(this.f46191b, strM8054s, strM8052q, language, arrayList, new e7f((int) (((long) colourDataM8049n.m8046n()) | 4278190080L), (int) (((long) colourDataM8049n.m8048q()) | 4278190080L), (int) (4278190080L | ((long) colourDataM8049n.m8047p()))), transcriptExcerpt.m8050o(), transcriptExcerpt.m8051p()));
            case 8:
                gqx gqxVar = (gqx) obj;
                String str = this.f46191b;
                return new gj81((uo31) gqxVar.mo45449a(uo31.class, str).f72301b, (daj) gqxVar.mo45449a(daj.class, str).f72301b, (w541) gqxVar.mo45449a(w541.class, str).f72301b, (zs6) gqxVar.mo45449a(zs6.class, str).f72301b);
        }
    }

    @Override // io.reactivex.rxjava3.functions.Predicate
    public boolean test(Object obj) {
        switch (this.f46190a) {
            case 6:
                String strM96199l = zi5.m96199l(((xi90) obj).f261832a);
                String strM96199l2 = zi5.m96199l(this.f46191b);
                return (strM96199l == null || strM96199l2 == null || !strM96199l.equals(strM96199l2)) ? false : true;
            default:
                PlayerState playerState = (PlayerState) obj;
                String strContextUri = playerState.contextUri();
                return (strContextUri == null || strContextUri.equals(this.f46191b) || !playerState.isPlaying() || playerState.isPaused()) ? false : true;
        }
    }

    public String toString() {
        switch (this.f46190a) {
            case 0:
                return this.f46191b;
            default:
                return super.toString();
        }
    }

    public d7f1(o091 o091Var, String str) {
        this.f46190a = 9;
        this.f46191b = str;
    }
}
