package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import p204p.s6i0;
import p204p.t6i0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m24212d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "<init>", "()V", "room-runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class MultiInstanceInvalidationService extends Service {

    /* JADX INFO: renamed from: a */
    public int f1303a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f1304b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final t6i0 f1305c = new t6i0(this);

    /* JADX INFO: renamed from: d */
    public final s6i0 f1306d = new s6i0(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f1306d;
    }
}
