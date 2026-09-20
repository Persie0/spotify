package p204p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: classes6.dex */
public final class r72 implements Connectable {

    /* JADX INFO: renamed from: b */
    public static final r72 f196410b = new r72(0);

    /* JADX INFO: renamed from: c */
    public static final r72 f196411c = new r72(1);

    /* JADX INFO: renamed from: d */
    public static final r72 f196412d = new r72(2);

    /* JADX INFO: renamed from: e */
    public static final r72 f196413e = new r72(3);

    /* JADX INFO: renamed from: f */
    public static final r72 f196414f = new r72(4);

    /* JADX INFO: renamed from: g */
    public static final r72 f196415g = new r72(5);

    /* JADX INFO: renamed from: h */
    public static final r72 f196416h = new r72(6);

    /* JADX INFO: renamed from: i */
    public static final r72 f196417i = new r72(7);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f196418a;

    public /* synthetic */ r72(int i) {
        this.f196418a = i;
    }

    @Override // com.spotify.mobius.Connectable
    /* JADX INFO: renamed from: P */
    public final Connection mo3269P(Consumer consumer) {
        switch (this.f196418a) {
            case 0:
                return new q72(consumer, 0);
            case 1:
                return new yn7(0);
            case 2:
                return new yn7(2);
            case 3:
                return new q72(consumer, 3);
            case 4:
                return new yn7(3);
            case 5:
                return new q72(consumer, 8);
            case 6:
                return new yn7(5);
            case 7:
                return new yn7(7);
            case 8:
                return new yn7(1);
            case 9:
                return new q72(consumer, 1);
            case 10:
                return new q72(consumer, 2);
            case 11:
                return new q72(consumer, 4);
            case 12:
                return new q72(this, consumer);
            case 13:
                return new q72(consumer, 6);
            case 14:
                return new q72(consumer, 7);
            case 15:
                int i = may.f141718a;
                return new yn7(4);
            default:
                return new yn7(6);
        }
    }

    public r72(ngl nglVar) {
        this.f196418a = 16;
    }
}
