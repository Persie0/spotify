package p204p;

import android.content.Context;
import com.spotify.betamax.player.VideoSurfaceView;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class b4c extends qe70 implements gh00 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f23299a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kqi0 f23300b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4c(kqi0 kqi0Var, int i) {
        super(1);
        this.f23299a = i;
        this.f23300b = kqi0Var;
    }

    @Override // p204p.gh00
    public final Object invoke(Object obj) {
        ogi ogiVar;
        int i = this.f23299a;
        int i2 = 1;
        w2a1 w2a1Var = w2a1.f247311a;
        kqi0 kqi0Var = this.f23300b;
        switch (i) {
            case 0:
                VideoSurfaceView videoSurfaceView = new VideoSurfaceView((Context) obj);
                videoSurfaceView.setBufferingThrobberEnabled(false);
                videoSurfaceView.setScaleType(mac1.ASPECT_FIT);
                kqi0Var.setValue(videoSurfaceView);
                return videoSurfaceView;
            case 1:
                VideoSurfaceView videoSurfaceView2 = (VideoSurfaceView) obj;
                if (!wj50.m88271j((VideoSurfaceView) kqi0Var.getValue(), videoSurfaceView2)) {
                    kqi0Var.setValue(videoSurfaceView2);
                }
                return w2a1Var;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                float f = pyc.f183385a;
                kqi0Var.setValue(bool);
                return w2a1Var;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                float f2 = pyc.f183385a;
                kqi0Var.setValue(bool2);
                return w2a1Var;
            case 4:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                kqi0Var.setValue(bool3);
                return w2a1Var;
            case 5:
                float f3 = pyc.f183385a;
                ((gh00) kqi0Var.getValue()).invoke(new swc((String) obj));
                return w2a1Var;
            case 6:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                kqi0Var.setValue(bool4);
                return w2a1Var;
            case 7:
                kqi0Var.setValue(opo.m67574x(g6f.m43700N0((List) obj, (qf40) kqi0Var.getValue())));
                return w2a1Var;
            case 8:
                String str = (String) obj;
                qf40 qf40Var = (qf40) kqi0Var.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : qf40Var) {
                    if (!wj50.m88271j(((wn50) obj2).f253066a, str)) {
                        arrayList.add(obj2);
                    }
                }
                kqi0Var.setValue(opo.m67574x(arrayList));
                return w2a1Var;
            case 9:
                kqi0Var.setValue(Boolean.valueOf(!((Boolean) obj).booleanValue()));
                return w2a1Var;
            case 10:
                return new y350((((long) 0) & 4294967295L) | (((long) ((int) ((Number) kqi0Var.getValue()).floatValue())) << 32));
            case 11:
                kqi0Var.setValue((db71) obj);
                return w2a1Var;
            case 12:
                kqi0Var.setValue((db71) obj);
                return w2a1Var;
            case 13:
                y350 y350Var = (y350) kqi0Var.getValue();
                return new y350(y350Var != null ? y350Var.f268755a : 0L);
            case 14:
                kqi0Var.setValue(Boolean.valueOf(((db71) obj).m35533d()));
                return w2a1Var;
            case 15:
                kqi0Var.setValue((db71) obj);
                return w2a1Var;
            case 16:
                if (((Number) obj).intValue() >= 10) {
                    kqi0Var.setValue(Boolean.TRUE);
                }
                return w2a1Var;
            case 17:
                ny51 ny51Var = ((sm6) obj).f210571b;
                p340 p340Var = ny51Var.f159718a;
                p340 p340Var2 = ny51Var.f159718a;
                kqi0Var.setValue((p340Var.mo68988d() == -1 || p340Var2.mo68986b() == -1) ? new pqm0(1, 1) : new pqm0(Integer.valueOf(p340Var2.mo68988d()), Integer.valueOf(p340Var2.mo68986b())));
                return w2a1Var;
            case 18:
                ny51 ny51Var2 = ((sm6) obj).f210571b;
                p340 p340Var3 = ny51Var2.f159718a;
                p340 p340Var4 = ny51Var2.f159718a;
                kqi0Var.setValue(p340Var3.mo68988d() != -1 ? new pqm0(Integer.valueOf(p340Var4.mo68988d()), Integer.valueOf(p340Var4.mo68986b())) : new pqm0(1, 1));
                return w2a1Var;
            case 19:
                ((gh00) kqi0Var.getValue()).invoke((jla0) obj);
                return w2a1Var;
            case 20:
                ((gh00) kqi0Var.getValue()).invoke((khq0) obj);
                return w2a1Var;
            case 21:
                kqi0Var.setValue(Boolean.valueOf(((kqz) obj).m57129b()));
                return w2a1Var;
            case 22:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                kqi0Var.setValue(bool5);
                return w2a1Var;
            case 23:
                gh00 gh00Var = (gh00) kqi0Var.getValue();
                int iOrdinal = ((tcx) obj).ordinal();
                if (iOrdinal == 0) {
                    ogiVar = ogi.f165167b;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ogiVar = ogi.f165166a;
                }
                gh00Var.invoke(ogiVar);
                return w2a1Var;
            case 24:
                kqi0Var.setValue(Boolean.TRUE);
                return w2a1Var;
            case 25:
                return new nfb(kqi0Var, i2);
            case 26:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 27:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
            case 28:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                kqi0Var.setValue(bool6);
                return w2a1Var;
            default:
                kqi0Var.setValue(Boolean.FALSE);
                return w2a1Var;
        }
    }
}
