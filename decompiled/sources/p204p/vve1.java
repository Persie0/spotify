package p204p;

import com.spotify.yourupdates.domain.models.ApplicationState;

/* JADX INFO: loaded from: classes11.dex */
public final class vve1 extends nwe1 {

    /* JADX INFO: renamed from: a */
    public final ApplicationState f245224a;

    public vve1(ApplicationState applicationState) {
        this.f245224a = applicationState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vve1) && this.f245224a == ((vve1) obj).f245224a;
    }

    public final int hashCode() {
        return this.f245224a.hashCode();
    }
}
