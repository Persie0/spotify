package p204p;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jmd1 implements qql0 {

    /* JADX INFO: renamed from: a */
    public final File f113839a;

    /* JADX INFO: renamed from: b */
    public final int f113840b;

    public jmd1(File file, int i) {
        this.f113839a = file;
        this.f113840b = i;
    }

    @Override // p204p.qql0
    /* JADX INFO: renamed from: a */
    public final void mo25857a() {
        try {
            Iterator it = m53774b().iterator();
            while (it.hasNext()) {
                pxy.m71562V((File) it.next());
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: b */
    public final List m53774b() {
        Integer numM29807r0;
        File[] fileArrListFiles = this.f113839a.listFiles();
        if (fileArrListFiles == null) {
            return lau.f131415a;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : fileArrListFiles) {
            if (file.isDirectory() && bm51.m29803n0(file.getName(), "app_webview_main_", false) && (numM29807r0 = bm51.m29807r0(wl51.m88469S0(file.getName(), "app_webview_main_"))) != null && numM29807r0.intValue() != this.f113840b && !new File(s571.m77246e(numM29807r0.intValue(), "/proc/")).exists()) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    @Override // p204p.qql0
    public final String getName() {
        return "WebViewDirCleanupOperation";
    }
}
