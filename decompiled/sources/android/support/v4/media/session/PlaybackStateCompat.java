package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p204p.a4p0;
import p204p.ikc0;
import p204p.luh0;
import p204p.ood0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new luh0(9);

    /* JADX INFO: renamed from: X */
    public final Bundle f30X;

    /* JADX INFO: renamed from: Y */
    public PlaybackState f31Y;

    /* JADX INFO: renamed from: a */
    public final int f32a;

    /* JADX INFO: renamed from: b */
    public final long f33b;

    /* JADX INFO: renamed from: c */
    public final long f34c;

    /* JADX INFO: renamed from: d */
    public final float f35d;

    /* JADX INFO: renamed from: e */
    public final long f36e;

    /* JADX INFO: renamed from: f */
    public final int f37f;

    /* JADX INFO: renamed from: g */
    public final CharSequence f38g;

    /* JADX INFO: renamed from: h */
    public final long f39h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f40i;

    /* JADX INFO: renamed from: t */
    public final long f41t;

    public PlaybackStateCompat(int i, long j, long j2, float f, long j3, int i2, CharSequence charSequence, long j4, ArrayList arrayList, long j5, Bundle bundle) {
        this.f32a = i;
        this.f33b = j;
        this.f34c = j2;
        this.f35d = f;
        this.f36e = j3;
        this.f37f = i2;
        this.f38g = charSequence;
        this.f39h = j4;
        this.f40i = new ArrayList(arrayList);
        this.f41t = j5;
        this.f30X = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f32a);
        sb.append(", position=");
        sb.append(this.f33b);
        sb.append(", buffered position=");
        sb.append(this.f34c);
        sb.append(", speed=");
        sb.append(this.f35d);
        sb.append(", updated=");
        sb.append(this.f39h);
        sb.append(", actions=");
        sb.append(this.f36e);
        sb.append(", error code=");
        sb.append(this.f37f);
        sb.append(", error message=");
        sb.append(this.f38g);
        sb.append(", custom actions=");
        sb.append(this.f40i);
        sb.append(", active item id=");
        return ikc0.m50938j(this.f41t, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f32a);
        parcel.writeLong(this.f33b);
        parcel.writeFloat(this.f35d);
        parcel.writeLong(this.f39h);
        parcel.writeLong(this.f34c);
        parcel.writeLong(this.f36e);
        TextUtils.writeToParcel(this.f38g, parcel, i);
        parcel.writeTypedList(this.f40i);
        parcel.writeLong(this.f41t);
        parcel.writeBundle(this.f30X);
        parcel.writeInt(this.f37f);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new C0007f();

        /* JADX INFO: renamed from: a */
        public final String f42a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f43b;

        /* JADX INFO: renamed from: c */
        public final int f44c;

        /* JADX INFO: renamed from: d */
        public final Bundle f45d;

        /* JADX INFO: renamed from: e */
        public PlaybackState.CustomAction f46e;

        public CustomAction(String str, CharSequence charSequence, int i, Bundle bundle) {
            this.f42a = str;
            this.f43b = charSequence;
            this.f44c = i;
            this.f45d = bundle;
        }

        /* JADX INFO: renamed from: c */
        public final String m35c() {
            return this.f42a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: g */
        public final PlaybackState.CustomAction m36g() {
            PlaybackState.CustomAction customAction = this.f46e;
            if (customAction != null) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder builderM24712e = a4p0.m24712e(this.f42a, this.f43b, this.f44c);
            a4p0.m24730w(builderM24712e, this.f45d);
            return a4p0.m24709b(builderM24712e);
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f43b) + ", mIcon=" + this.f44c + ", mExtras=" + this.f45d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f42a);
            TextUtils.writeToParcel(this.f43b, parcel, i);
            parcel.writeInt(this.f44c);
            parcel.writeBundle(this.f45d);
        }

        public CustomAction(Parcel parcel) {
            this.f42a = parcel.readString();
            this.f43b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f44c = parcel.readInt();
            this.f45d = parcel.readBundle(ood0.class.getClassLoader());
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f32a = parcel.readInt();
        this.f33b = parcel.readLong();
        this.f35d = parcel.readFloat();
        this.f39h = parcel.readLong();
        this.f34c = parcel.readLong();
        this.f36e = parcel.readLong();
        this.f38g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f40i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f41t = parcel.readLong();
        this.f30X = parcel.readBundle(ood0.class.getClassLoader());
        this.f37f = parcel.readInt();
    }
}
