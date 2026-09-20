package p204p;

import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class du6 extends ContentObserver {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f52984a;

    /* JADX INFO: renamed from: b */
    public final Uri f52985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ eu6 f52986c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du6(eu6 eu6Var, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f52986c = eu6Var;
        this.f52984a = contentResolver;
        this.f52985b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        eu6 eu6Var = this.f52986c;
        List listM40033g = eu6Var.m40033g();
        Context context = (Context) eu6Var.f62877b;
        xs6 xs6Var = (xs6) eu6Var.f62886k;
        AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) eu6Var.f62885j;
        wsv0 wsv0Var = bu6.f31027e;
        eu6Var.m40034h(bu6.m30504b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xs6Var, audioDeviceInfo, listM40033g));
    }
}
