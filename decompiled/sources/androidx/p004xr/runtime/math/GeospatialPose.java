package androidx.p004xr.runtime.math;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p204p.wj50;
import p204p.xl81;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m24211d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, m24212d2 = {"Landroidx/xr/runtime/math/GeospatialPose;", "", "latitude", "", "longitude", "altitude", "eastUpSouthQuaternion", "Landroidx/xr/runtime/math/Quaternion;", "<init>", "(DDDLandroidx/xr/runtime/math/Quaternion;)V", "getLatitude", "()D", "getLongitude", "getAltitude", "getEastUpSouthQuaternion", "()Landroidx/xr/runtime/math/Quaternion;", "equals", "", "other", "hashCode", "", "toString", "", "runtime"}, m24213k = 1, m24214mv = {2, 1, 0}, m24216xi = 48)
public final class GeospatialPose {
    private final double altitude;
    private final Quaternion eastUpSouthQuaternion;
    private final double latitude;
    private final double longitude;

    public GeospatialPose() {
        this(0.0d, 0.0d, 0.0d, null, 15, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GeospatialPose)) {
            return false;
        }
        GeospatialPose geospatialPose = (GeospatialPose) other;
        return this.latitude == geospatialPose.latitude && this.longitude == geospatialPose.longitude && this.altitude == geospatialPose.altitude && wj50.m88271j(this.eastUpSouthQuaternion, geospatialPose.eastUpSouthQuaternion);
    }

    public final double getAltitude() {
        return this.altitude;
    }

    public final Quaternion getEastUpSouthQuaternion() {
        return this.eastUpSouthQuaternion;
    }

    public final double getLatitude() {
        return this.latitude;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return this.eastUpSouthQuaternion.hashCode() + xl81.m91399h(this.altitude, xl81.m91399h(this.longitude, Double.hashCode(this.latitude) * 31, 31), 31);
    }

    public String toString() {
        return "GeospatialPose{\n\tLatitude=" + this.latitude + "\n\tLongitude=" + this.longitude + "\n\tAltitude=" + this.altitude + "\n\tEastUpSouthQuaternion=" + this.eastUpSouthQuaternion + "\n}";
    }

    public GeospatialPose(double d, double d2, double d3, Quaternion quaternion) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.eastUpSouthQuaternion = quaternion;
    }

    public /* synthetic */ GeospatialPose(double d, double d2, double d3, Quaternion quaternion, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) == 0 ? d3 : 0.0d, (i & 8) != 0 ? new Quaternion(0.0f, 0.0f, 0.0f, 0.0f, 15, null) : quaternion);
    }
}
