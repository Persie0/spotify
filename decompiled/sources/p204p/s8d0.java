package p204p;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.os.ResultReceiver;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class s8d0 extends z8d0 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f206628e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ResultReceiver f206629f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s8d0(Object obj, ResultReceiver resultReceiver, int i) {
        super(obj);
        this.f206628e = i;
        this.f206629f = resultReceiver;
    }

    @Override // p204p.z8d0
    /* JADX INFO: renamed from: c */
    public final void mo74980c(Object obj) {
        switch (this.f206628e) {
            case 0:
                MediaBrowserCompat$MediaItem mediaBrowserCompat$MediaItem = (MediaBrowserCompat$MediaItem) obj;
                int i = this.f280450d & 2;
                ResultReceiver resultReceiver = this.f206629f;
                if (i == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(MediaBrowserServiceCompat.KEY_MEDIA_ITEM, mediaBrowserCompat$MediaItem);
                    resultReceiver.send(0, bundle);
                } else {
                    resultReceiver.send(-1, null);
                }
                break;
            default:
                List list = (List) obj;
                ResultReceiver resultReceiver2 = this.f206629f;
                if (list != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArray(MediaBrowserServiceCompat.KEY_SEARCH_RESULTS, (Parcelable[]) list.toArray(new MediaBrowserCompat$MediaItem[0]));
                    resultReceiver2.send(0, bundle2);
                } else {
                    resultReceiver2.send(-1, null);
                }
                break;
        }
    }
}
