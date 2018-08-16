#include <iostream>

using namespace std;
struct Node
{
int data;
struct Node *next;
};
class linkedlist
{

    public:
    struct Node *insert(struct Node *head,int n)
    {
        int val;
        struct Node *ptr=head;
        while(n!=0)
        {
            struct Node *temp=new Node;
            cout<<"eneter the value:";
            cin>>val;
            temp->data=val;
            temp->next=NULL;
            if(head==NULL)
            {
                head=temp;
                ptr=head;
            }
            else
            {
                ptr->next=temp;
                ptr=ptr->next;
            }
            n--;
        }
    return head;
    }
    void print(struct Node*head)
    {
        while(head!=NULL)
        {
            cout<<head->data;
            head=head->next;
        }
    }
};
int main()
{
    linkedlist obj;
    struct Node *s=NULL,*head;
    int n;
    cout<<"enter the no. of nodes to create:";
    cin>>n;

    head=obj.insert(s,n);
    obj.print(head);
}
