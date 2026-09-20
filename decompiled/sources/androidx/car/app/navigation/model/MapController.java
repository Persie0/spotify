package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import java.util.Objects;
import p204p.agc0;
import p204p.irm0;
import p204p.rzb;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class MapController {
    private final ActionStrip mMapActionStrip;
    private final irm0 mPanModeDelegate;

    public MapController(agc0 agc0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapController)) {
            return false;
        }
        MapController mapController = (MapController) obj;
        return Boolean.valueOf(this.mPanModeDelegate == null).equals(Boolean.valueOf(mapController.mPanModeDelegate == null)) && Objects.equals(this.mMapActionStrip, mapController.mMapActionStrip);
    }

    public ActionStrip getMapActionStrip() {
        return this.mMapActionStrip;
    }

    public irm0 getPanModeDelegate() {
        return this.mPanModeDelegate;
    }

    public int hashCode() {
        return Objects.hash(this.mPanModeDelegate, this.mMapActionStrip);
    }

    private MapController() {
        this.mPanModeDelegate = null;
        this.mMapActionStrip = null;
    }
}
