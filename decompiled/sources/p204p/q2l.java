package p204p;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q2l implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f184655a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f184655a) {
            case 0:
                return str.startsWith("aqs.");
            case 1:
                return str.startsWith(".ae");
            default:
                return str.startsWith("event");
        }
    }
}
