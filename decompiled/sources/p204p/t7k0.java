package p204p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class t7k0 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f217844a;

    public t7k0(er70 er70Var, er70 er70Var2, er70 er70Var3, er70 er70Var4, er70 er70Var5, er70 er70Var6, er70 er70Var7, er70 er70Var8, er70 er70Var9, er70 er70Var10, wf4 wf4Var, qb4 qb4Var) {
        Set setM29624m1 = bk5.m29624m1(new s7k0[]{new s7k0("SleepTimerNudge", er70Var, true), new s7k0("RemoteVolumeWidgetPlugin", er70Var2, true), new s7k0("NpvActivityVolumeSmartControlPlugin", er70Var3, true), new s7k0("AudiobookProgressNudgePlugin", er70Var4, true), new s7k0("EmbeddedAdNpvPlugin", er70Var5, true), new s7k0("BannerSessionNavigationPlugin", er70Var6, true), new s7k0("LyricsOnNpvVisibilityPlugin", er70Var7, true), new s7k0("VideoManifestPrefetchPlugin", er70Var8, qb4Var.m72480a()), new s7k0("AgentNowPlayingActivityUi", er70Var9, wf4Var.m87930A()), new s7k0("AgeAssuranceBlockingPlugin", er70Var10, true)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : setM29624m1) {
            if (((s7k0) obj).f206395c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(i6f.m49804T(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            er70 er70Var11 = ((s7k0) it.next()).f206394b;
            if (er70Var11 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList2.add(er70Var11);
        }
        this.f217844a = arrayList2;
    }
}
