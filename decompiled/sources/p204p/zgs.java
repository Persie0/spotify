package p204p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class zgs implements Parcelable {
    public static final Parcelable.Creator<zgs> CREATOR = new f9s(6);

    /* JADX INFO: renamed from: a */
    public int f282700a;

    /* JADX INFO: renamed from: b */
    public final UUID f282701b;

    /* JADX INFO: renamed from: c */
    public final String f282702c;

    /* JADX INFO: renamed from: d */
    public final String f282703d;

    /* JADX INFO: renamed from: e */
    public final byte[] f282704e;

    public zgs(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.f282701b = uuid;
        this.f282702c = str;
        str2.getClass();
        this.f282703d = def0.m35799p(str2);
        this.f282704e = bArr;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m96105c(UUID uuid) {
        UUID uuid2 = mva.f147545b;
        UUID uuid3 = this.f282701b;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zgs)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zgs zgsVar = (zgs) obj;
        return Objects.equals(this.f282702c, zgsVar.f282702c) && Objects.equals(this.f282703d, zgsVar.f282703d) && Objects.equals(this.f282701b, zgsVar.f282701b) && Arrays.equals(this.f282704e, zgsVar.f282704e);
    }

    public final int hashCode() {
        if (this.f282700a == 0) {
            int iHashCode = this.f282701b.hashCode() * 31;
            String str = this.f282702c;
            this.f282700a = Arrays.hashCode(this.f282704e) + s571.m77243b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f282703d);
        }
        return this.f282700a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.f282701b;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.f282702c);
        parcel.writeString(this.f282703d);
        parcel.writeByteArray(this.f282704e);
    }

    public zgs(Parcel parcel) {
        this.f282701b = new UUID(parcel.readLong(), parcel.readLong());
        this.f282702c = parcel.readString();
        String string = parcel.readString();
        String str = h0b1.f86200a;
        this.f282703d = string;
        this.f282704e = parcel.createByteArray();
    }
}
