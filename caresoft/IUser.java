public interface IUser
{
	Boolean AssignPin(Integer pin);
	Boolean Authorize(Integer pin);
};