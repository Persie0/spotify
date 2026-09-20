package p204p;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public interface vkd0 {
    /* JADX INFO: renamed from: d */
    ParcelFileDescriptor mo35084d(Uri uri, File file, String str);

    /* JADX INFO: renamed from: h */
    default String[] mo85819h() {
        return new String[]{"image/png"};
    }
}
