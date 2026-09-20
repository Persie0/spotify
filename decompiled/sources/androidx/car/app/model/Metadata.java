package androidx.car.app.model;

import java.util.Objects;
import p204p.p5f0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class Metadata {
    public static final Metadata EMPTY_METADATA = new Metadata(new p5f0());
    private final Place mPlace;

    public Metadata(p5f0 p5f0Var) {
        p5f0Var.getClass();
        this.mPlace = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Metadata) {
            return Objects.equals(this.mPlace, ((Metadata) obj).mPlace);
        }
        return false;
    }

    public Place getPlace() {
        return this.mPlace;
    }

    public int hashCode() {
        return Objects.hashCode(this.mPlace);
    }

    private Metadata() {
        this.mPlace = null;
    }
}
