package p204p;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class wbu0 implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f249854a;

    public wbu0(String str) {
        this.f249854a = str;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return str.startsWith(this.f249854a);
    }
}
