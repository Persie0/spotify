package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class xdk0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f260502a;

    public xdk0(er70 er70Var, er70 er70Var2, er70 er70Var3, er70 er70Var4, er70 er70Var5, er70 er70Var6, er70 er70Var7, er70 er70Var8, er70 er70Var9, er70 er70Var10, wf4 wf4Var, qb4 qb4Var) {
        Set setM29624m1 = bk5.m29624m1(new wdk0[]{new wdk0("SleepTimerNudge", er70Var, true), new wdk0("RemoteVolumeWidgetPlugin", er70Var2, true), new wdk0("NpvActivityVolumeSmartControlPlugin", er70Var3, true), new wdk0("AudiobookProgressNudgePlugin", er70Var4, true), new wdk0("EmbeddedAdNpvPlugin", er70Var5, true), new wdk0("BannerSessionNavigationPlugin", er70Var6, true), new wdk0("LyricsOnNpvVisibilityPlugin", er70Var7, true), new wdk0("VideoManifestPrefetchPlugin", er70Var8, qb4Var.m72480a()), new wdk0("AgentNowPlayingActivityUi", er70Var9, wf4Var.m87930A()), new wdk0("AgeAssuranceBlockingPlugin", er70Var10, true)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM29624m1) {
            if (((wdk0) obj).f250303c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            er70 er70Var11 = ((wdk0) it.next()).f250302b;
            if (er70Var11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList2.add(er70Var11);
        }
        this.f260502a = arrayList2;
    }
}
