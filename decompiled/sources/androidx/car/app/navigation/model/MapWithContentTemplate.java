package androidx.car.app.navigation.model;

import androidx.car.app.model.ActionStrip;
import java.util.Objects;
import p204p.ijc0;
import p204p.jjc0;
import p204p.rzb;
import p204p.ty61;

/* JADX INFO: loaded from: classes3.dex */
@rzb
public final class MapWithContentTemplate implements ty61 {
    private final ActionStrip mActionStrip;
    private final ty61 mContentTemplate;
    private final MapController mMapController;

    public MapWithContentTemplate(jjc0 jjc0Var) {
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapWithContentTemplate)) {
            return false;
        }
        MapWithContentTemplate mapWithContentTemplate = (MapWithContentTemplate) obj;
        return Objects.equals(this.mContentTemplate, mapWithContentTemplate.mContentTemplate) && Objects.equals(this.mMapController, mapWithContentTemplate.mMapController) && Objects.equals(this.mActionStrip, mapWithContentTemplate.mActionStrip);
    }

    public ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public ty61 getContentTemplate() {
        return this.mContentTemplate;
    }

    public MapController getMapController() {
        return this.mMapController;
    }

    public int hashCode() {
        return Objects.hash(this.mMapController, this.mContentTemplate, this.mActionStrip);
    }

    private MapWithContentTemplate() {
        this.mMapController = null;
        this.mContentTemplate = new ijc0();
        this.mActionStrip = null;
    }
}
