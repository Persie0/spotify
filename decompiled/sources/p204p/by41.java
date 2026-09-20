package p204p;

import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SeekToCommand;

/* JADX INFO: loaded from: classes9.dex */
public final class by41 {

    /* JADX INFO: renamed from: a */
    public final xre f32070a;

    /* JADX INFO: renamed from: b */
    public PlayerState f32071b = PlayerState.EMPTY;

    /* JADX INFO: renamed from: c */
    public xul0 f32072c = C2244p5.f174033a;

    /* JADX INFO: renamed from: d */
    public long f32073d;

    public by41(xre xreVar) {
        this.f32070a = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public final xul0 m30867a(long j) {
        return (this.f32071b.positionAsOfTimestamp().mo49279c() && this.f32071b.duration().mo49279c()) ? this.f32072c.mo49282g(this.f32071b.position(j)) : C2244p5.f174033a;
    }

    /* JADX INFO: renamed from: b */
    public final void m30868b(long j, SeekToCommand.Relative relative) {
        if (((Long) this.f32071b.duration().mo49280e(0L)).longValue() == 0 || !this.f32071b.restrictions().disallowSeekingReasons().isEmpty()) {
            return;
        }
        ((wy3) this.f32070a).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f32073d = jCurrentTimeMillis;
        int i = ay41.f21098a[relative.ordinal()];
        if (i == 1) {
            this.f32072c = new hzq0(Long.valueOf(j));
        } else {
            if (i != 2) {
                return;
            }
            this.f32072c = new hzq0(Long.valueOf(((Long) m30867a(jCurrentTimeMillis).mo49280e(0L)).longValue() + j));
        }
    }
}
